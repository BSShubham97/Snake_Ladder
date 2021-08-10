package com.shubham;

/**
 * @author Shubham
 * @version 1.0
 * @since 10/08/2021
 */
public class SnakeLadder {

    /**
     * The snake and ladder game where  the player starts at postion 0 and rolls the dice to reach position 100
     * There are snakes present at certain locations they can decrease the player position
     * There are ladders at certain conditions they can increase the player position
     * @return Winner who reaches position 100 first
     */
    public int getDiceRoll(){
    int faceValue ;
    faceValue=(int) Math.floor(Math.random()*10 %7);
    int fv=faceValue;
    return (fv);
}

public static void main(String[] args){
    SnakeLadder sl = new SnakeLadder();
    int face_value ;
    face_value= sl.getDiceRoll();
    System.out.println("value:"+face_value);
    }

}
