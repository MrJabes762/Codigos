package core.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import core.model.Sensor;
import core.service.SensorService;

@Path("/sensor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SensorController {

    private static SensorService sensorService;

    public SensorController() {
        setSensorService(SensorService.getInstance());
    }

    @POST
    public Response adicionarSensor (@QueryParam("identificacao") String identificacao,
                                    @QueryParam("localizacao") String localizacao) {
        try {
            Sensor sensor = getSensorService().adicionarSensor(identificacao, localizacao);
            return Response.ok(sensor).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Erro ao adicionar sensor: " + e.getMessage())
                    .build();
        }
    }

    @GET
    public Response listarSensores() {
        try {
            return Response.ok(getSensorService().listarSensores()).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Erro ao listar sensores: " + e.getMessage())
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    public Response buscarSensorPorId(@PathParam("id") int id) {
        try {
            Sensor sensor = getSensorService().buscarSensorPorId(id);
            return Response.ok(sensor).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Erro ao buscar sensor: " + e.getMessage())
                    .build();
        }
    }
    @DELETE
    @Path("/{id}")
    public Response removerSensor(@PathParam("id") int id) {
        try {
            return getSensorService().removerSensor(id) ? Response.ok().build() : Response.status(Response.Status.NOT_FOUND).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Erro ao remover sensor: " + e.getMessage())
                    .build();
        }
    }
    private static SensorService getSensorService() {
        return sensorService;
    }

    private void setSensorService(SensorService sensorService) {
        SensorController.sensorService = sensorService;
    }
}
