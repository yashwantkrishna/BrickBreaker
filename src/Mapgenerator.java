//package com.yash.Project;
import java.awt.*;

public class Mapgenerator {
    public int map[][];
    public int brickwidth;
    public int brickheight;
    public Mapgenerator(int row, int col){
        map = new int[row][col];
        for(int i =0;i< map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j] =1;
            }
        }
        brickheight= 150/row;
        brickwidth=540/col;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.white);
                    g.fillRect(j * brickwidth + 80, i * brickheight + 50, brickwidth, brickheight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j * brickwidth + 80, i * brickheight + 50, brickwidth, brickheight);
                }
            }


        }

    }     public void setBrickValue(int value,int row,int col){
        map[row][col] = value;
    }
}

