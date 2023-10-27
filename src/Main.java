
import controller.GarbageCollectionController;
import java.util.Scanner;
import model.GarbageCollection;
import view.GarbageCollectionView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
     public static void main(String[] args) {
        // Input: the amount of garbage at each station
        //int[] garbageAtStations = {1765, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277};
        
         int[] garbageAtStations = new int[100];  // Assuming a maximum of 100 stations

        // Input data from the user
        Scanner scanner = new Scanner(System.in);
        int stationCount = 0;

        System.out.print("Enter the amount of garbage at the next station (kg), or -1 to end: ");
        int garbage = scanner.nextInt();

        // Create objects of Model and View
        GarbageCollection model = new GarbageCollection(garbageAtStations);
        GarbageCollectionView view = new GarbageCollectionView();

        // Create object of Controller
        GarbageCollectionController controller = new GarbageCollectionController(model, view);

        // Calculate cost and update view
        controller.calculateCost();
        controller.updateView();
    }
}
