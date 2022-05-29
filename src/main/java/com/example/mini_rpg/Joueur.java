package com.example.mini_rpg;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import java.util.ArrayList;
import java.util.Random;



public class Joueur implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Text Group_list;
    @FXML
    private Text Info;
    @FXML
    private Text Info_items;
    @FXML
    private Text Info_stats;
    @FXML
    private AnchorPane Joueur;
    @FXML
    private Button game_play;
    @FXML
    private Button healer;
    @FXML
    private Button hunter;
    @FXML
    private ImageView image_class;
    @FXML
    private Button mage;
    @FXML
    private TextField name;
    @FXML
    private HBox nom;
    @FXML
    private HBox role;
    @FXML
    private Button team_add;
    @FXML
    private Button warrior;
    @FXML
    private Text text;
    int power = 0;

    public Joueur() {
    }


    public void Hunter(ActionEvent event) throws IOException {
        Info.setText(" Hunter : \n\nLe Hunter peut combattre aussi bien de près que de loin. C’est un tireur hors pair possédant de grandes capacités de tireur d'elite avec ses flèches.\n");
        Info_stats.setText(" Point de vie : 30 \n Armure : 20 \n Dégats : 30 \n");
        Info_items.setText(" Objets: \n Fléches : 40 \n");
        power = 1;
    }

    public void Mage(ActionEvent event) throws IOException {
        Info.setText(" Mage : \n\nLe Mage est un classe basée sur l'attaque, il utilise sa magie pour générer divers effets puissants. \n");
        Info_stats.setText(" \n Point de vie : 25 \n Armure : 15 \n Dégats : 40 \n Point de Mana : 100 \n");
        Info_items.setText(" \n Objets: \n aucun  \n");
        power = 2;
    }

    public void Warrior(ActionEvent event) throws IOException {
        Info.setText(" Warrior : \n\nLe Warrior est un classe basée sur la robustesse, c’est un guerrier brutal, peu enclin à la réflexion et ayant en horreur la magie, mais il est naturellement résistant, en effet un Warrior  n'a jamais peur de sauter dans la mélée.\n");
        Info_stats.setText(" \n Point de vie : 50 \n Armure : 30 \n Dégats 20 \n");
        Info_items.setText(" \n Objets: \n aucun\n");
        power = 3;
    }

    public void Healer(ActionEvent event) throws IOException {
        Info.setText(" Healer : \n\nLe Healer est le support de ses alliés. C'est un spécialiste dans le soin grâce à sa magie.\n");
        Info_stats.setText(" \n Point de vie : 20 \n Armure : 15 \n  Point de Mana : 100 \n");
        Info_items.setText(" \n Objets: \n aucun\n");
        power = 4;
    }
    int g=0;
    static ArrayList Group = new ArrayList<>();
    public void Ajouter(){
        if (Group.size()<=4){
            switch(power){
                case 1 :
                    Main.heroes.add(new Hunter(name.getText()));
                    Group.add(name.getText() + "\nHunter \n");
                    break;
                case 2 :
                    Main.heroes.add(new Mage(name.getText()));
                    Group.add(name.getText() + "\nMage \n");
                    break;
                case 3 :
                    Main.heroes.add(new Warrior(name.getText()));
                    Group.add(name.getText() + "\nWarrior \n");
                    break;
                case 4 :
                    Main.heroes.add(new Healer(name.getText()));
                    Group.add(name.getText() + "\nHealer \n");
                    break;
            }
            switch (Group.size()){
                case 1 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n");game_play.setDisable(false);break;
                case 2 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n"+"\n"+Main.heroes.get(1).getName()+"  "+ Main.heroes.get(1).getClasse()+"\n");game_play.setDisable(false);break;
                case 3 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n"+"\n"+Main.heroes.get(1).getName()+"  "+ Main.heroes.get(1).getClasse()+"\n"+"\n"+Main.heroes.get(2).getName()+"  "+  Main.heroes.get(2).getClasse()+"\n");game_play.setDisable(false);break;
                case 4 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n"+"\n"+Main.heroes.get(1).getName()+"  "+ Main.heroes.get(1).getClasse()+"\n"+"\n"+Main.heroes.get(2).getName()+"  "+  Main.heroes.get(2).getClasse()+"\n"+"\n"+Main.heroes.get(3).getName()+"  "+  Main.heroes.get(3).getClasse()+"\n");team_add.setDisable(true);game_play.setDisable(false);break;
            }
        }
        else{
            team_add.setDisable(true);
        }
    }
    int round = 1;
    public static void CreateEnemy(int round){
        for (int i = 0; i < Main.heroes.size(); i++) {
            if (Math.random() > round*0.2) {
                int lifePoints = new Random().nextInt(round*3/2+15)+10;
                int armor = new Random().nextInt(round+5) ;
                int damage = new Random().nextInt(round*5+10);
                String name = "Orc";
                Main.enemies.add(new BasicEnemy(name, lifePoints, "basic", armor, damage));
            }else {
                int lifePoints = new Random().nextInt(100)+ round * 10;
                int armor = new Random().nextInt(round+5)+10;
                int damage = new Random().nextInt(round*10)+20;
                String name = "Démon";
                Main.enemies.add(new Boss(name, lifePoints, "boss", armor, damage));
            }
        }
    }
    @FXML
    private void switchtoPlay() throws IOException {
        CreateEnemy(round);
        Main.setRoot("Play");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }
}
