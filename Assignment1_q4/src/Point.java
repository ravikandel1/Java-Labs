/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Point {
    int x;
    int y;
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    @Override
    public String toString(){
        return "(X,Y)= ("+this.x+","+this.y+")";
    }
}
