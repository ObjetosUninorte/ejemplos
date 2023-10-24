/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.rutas;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class RouteManager {
    private Board board;

    public RouteManager(Board board) {
        this.board = board;
    }
    
    public void setStartEndPoints(){
        //get random cells from board until we find a walkable cell
        Cell start = board.getRandomCell();
        while(!start.isPosibleStartOrEnd()){
            start = board.getRandomCell();
        }
        start.setAsSart();
        board.setStartCell(start);

        start = board.getRandomCell();
        while(!start.isPosibleStartOrEnd()){
            start = board.getRandomCell();
        }

        start.setAsEnd();
        board.setEndCell(start);

    }

    // find route from start to end using a* algorithm
    public void findRoute(){
        Cell start = board.getStartCell();
        Cell end = board.getEndCell();

        ArrayList<Cell> openList = new ArrayList<Cell>();
        ArrayList<Cell> closedList = new ArrayList<Cell>();

        // add start cell to open list
        start.setG(0);
        start.setH(0);
        start.calculateF();
        openList.add(start);

        // while open list is not empty
        while(!openList.isEmpty()){
            // get cell with lowest f value
            Cell current = getLowestFCell(openList);
            // remove current from open list
            openList.remove(current);
            // add current to closed list
            closedList.add(current);
            // if current is end cell, we found the route
            if(current == end){
                // reconstruct path
                //reconstructPath();
                return;
            }
            // get neighbors of current
            Cell[] neighbors = board.getNeighbors(current);
            // for each neighbor
            for(Cell neighbor : neighbors){
                // if neighbor is not walkable or is in closed list, skip it
                if(!neighbor.isWalkable() || closedList.contains(neighbor)){
                    continue;
                }
                // calculate g, h and f values
                int g = current.getG() + 1;
                int h = calculateH(neighbor, end);
                int f = g + h;
                // if neighbor is not in open list, add it
                if(!openList.contains(neighbor)){
                    openList.add(neighbor);
                    neighbor.setG(g);
                    neighbor.setH(h);
                    neighbor.calculateF();
                    neighbor.setParent(current);
                    openList.add(neighbor);
                }
                // if neighbor is in open list, check if g value is lower than current
                else{
                    if(g < neighbor.getG()){
                        neighbor.setG(g);
                        neighbor.setH(h);
                        neighbor.calculateF();
                        neighbor.setParent(current);
                    }
                }
            }
        }
    }

    int calculateH(Cell neighbor, Cell end) {
        int x = Math.abs(neighbor.getX() - end.getX());
        int y = Math.abs(neighbor.getY() - end.getY());
        return x + y;
    }

    private Cell getLowestFCell(ArrayList<Cell> openList) {
        Cell lowestFCell = openList.get(0);
        for(Cell cell : openList){
            if(cell.getF() < lowestFCell.getF()){
                lowestFCell = cell;
            }
        }
        return lowestFCell;
    }
        
    
    
}
