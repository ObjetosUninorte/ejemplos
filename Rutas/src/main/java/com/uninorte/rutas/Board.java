/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.rutas;

import java.util.ArrayList;


public class Board {
    private int width;
    private int height;
    private Cell startCell, endCell;
    private ArrayList<Cell> cells;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new ArrayList<>();
        generateCells();
    }

    private void generateCells() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height ; j++) {
                Cell cell = new Cell(i, j);
                // get a random number from 0 to 10, if it is lower than 2 then set cell as not walkable
                if (Math.random() * 10 < 2) {
                    cell.setWalkable(false);
                }
                this.cells.add(cell);
                
                // if cell is not on first row add top neighbor
                if (i > 0) {
                    Cell topNeighbor = this.cells.get((i - 1) * this.width + j);
                    cell.addNeighbor(topNeighbor);
                    topNeighbor.addNeighbor(cell);
                }

                // if cell is not on first column add left neighbor
                if (j > 0) {
                    Cell leftNeighbor = this.cells.get(i * this.width + (j - 1));
                    cell.addNeighbor(leftNeighbor);
                    leftNeighbor.addNeighbor(cell);
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height ; j++) {
                Cell cell = this.cells.get(i * this.width + j);
                System.out.print(cell+"\t");
            }
            System.out.println();
        }
    }

    public void printCellsNeighbors() {
        for (Cell cell : cells) {
            cell.printNeighbors();
        }
    }

    public Cell getRandomCell() {
        int randomIndex = (int) (Math.random() * this.cells.size());
        return this.cells.get(randomIndex);
    }

    public Cell getStartCell() {
        return startCell;
    }

    public void setStartCell(Cell startCell) {
        this.startCell = startCell;
    }

    public Cell getEndCell() {
        return endCell;
    }

    public void setEndCell(Cell endCell) {
        this.endCell = endCell;
    }    
}
