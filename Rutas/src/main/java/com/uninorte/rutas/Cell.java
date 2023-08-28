/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.rutas;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Cell {
    
    private boolean isWalkable = true;
    private boolean isStart = false;
    private boolean isEnd = false;
    private int gCost, hCost, fCost;
    private int x, y ;
    private ArrayList<Cell> neighbors = new ArrayList<Cell>();

    public Cell(boolean isWalkable, int x, int y) {
        neighbors = new ArrayList<Cell>();
        this.isWalkable = isWalkable;
        this.x = x;
        this.y = y;
    }

    public Cell(int x, int y) {
        neighbors = new ArrayList<Cell>();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getG() {
        return gCost;
    }

    public void setG(int gCost) {
        this.gCost = gCost;
    }

    public void setH(int hCost) {
        this.hCost = hCost;
    }





    public ArrayList<Cell> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Cell neighbor) {
        this.neighbors.add(neighbor);
    }

    public void printNeighbors() {
        System.out.println("Neighbors of " + this);
        for (Cell neighbor : neighbors) {
            System.out.println(neighbor);
        }
    }

    public void setWalkable(boolean isWalkable) {
        this.isWalkable = isWalkable;
    }

    public boolean isWalkable() {
        return isWalkable;
    }

    public boolean isPosibleStartOrEnd() {
        return isStart || isEnd || !isWalkable;  
    }

    public void setAsSart() {
        this.isStart = true;
    }

    public void setAsEnd(){
        this.isEnd = true;
    }
    
    public void calculateF()
    {
        fCost = gCost + hCost;
    }

    @Override
    public String toString() {
        if(isStart){
            return " "+x+" "+y+ "S ";
        }
        if(isEnd){
            return " "+x+" "+y+ "E ";
        }
        if (isWalkable){
            return " "+x+" "+y+ " ";
        }
        return " "+x+" "+y+ "x ";
    }

    public int getF() {
        return fCost;
    }
  
}
