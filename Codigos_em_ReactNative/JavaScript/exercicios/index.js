import '@expo/metro-runtime'; // Essa importação ajuda no processo de Hotreloading para visualizar uma alteração em tempo real 
import { registerRootComponent } from 'expo';
import App from './App';
// registerRootComponent calls AppRegistry.registerComponent('main', () => App);
// It also ensures that whether you load the app in Expo Go or in a native build,
// the environment is set up appropriately
registerRootComponent(App);
