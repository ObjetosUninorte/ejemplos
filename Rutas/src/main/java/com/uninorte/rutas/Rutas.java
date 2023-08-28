/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uninorte.rutas;

/**
 *
 * @author augustosalazar
 */
public class Rutas {

    private Board board;
    private RouteManager routeManager;

    public Rutas() {
        this.board = new Board(10, 10);
        routeManager = new RouteManager(board);
        routeManager.setStartEndPoints();
    }

    public static void main(String[] args) {
        Rutas rutas = new Rutas();
        rutas.board.printBoard();

        //rutas.board.printCellsNeighbors();
    }
}
