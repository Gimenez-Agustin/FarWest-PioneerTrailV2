package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Scene;

/**
 *
 * @author Agustin
 */
public class SceneControl {
    
    public static Scene[] createScenes(){
        Scene scenes[] = new Scene[2];
        Scene scene = new Scene();
        scene.setName("Store");
        scene.setDescription("Store");
        scenes[0]= scene;
        scene = new Scene();
        scene.setName("House");
        scene.setDescription("House to rest");
        scenes[1]= scene;
        return scenes;
    }
}
