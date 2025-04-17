package core.grpc;

import io.quarkus.grpc.GrpcService;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import jakarta.inject.Singleton;
import sistemaDistribuido.model.Sensor;
import sistemaDistribuido.service.SensorService;

@Singleton 
@GrpcService
public class SensorGrpcService extends SensorServiceGrpc.SensorServiceImplBase {

    private SensorService sensorService;

    public SensorGrpcService(){
        sensorService = SensorService.getInstance();    
    }

    @Override
    public void adicionarSensor(SensorRequest request, StreamObserver<SensorResponse> responseObserver) {
        Sensor sensor = sensorService.adicionarSensor(request.getIdentificacao(), request.getLocalizacao());

        SensorResponse response = SensorResponse.newBuilder()
                .setMensagem("Sensor adicionado: " + sensor.getIdentificacao())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listarSensores(Empty request, StreamObserver<SensorRequest> responseObserver) {
        for (Sensor sensor : sensorService.listarSensores()) {
            SensorRequest s = SensorRequest.newBuilder()
                    .setIdentificacao(sensor.getIdentificacao())
                    .setLocalizacao(sensor.getLocalizacao())
                    .build();
            responseObserver.onNext(s);
        }
        responseObserver.onCompleted();
    }
}