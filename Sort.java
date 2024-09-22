/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphs;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hgsim
 */
public class Sort<T extends Neighbor> {
    
    public void selectionSortAscendingCost(ArrayList<T> neighbors)
    {
        for (int j = neighbors.size() - 1; j != 0; j--)
        {
            int i; int tmp = 0;
            for (i = 1; i <= j; i++)
            {
                if ((neighbors.get(tmp).getCost()) < (neighbors.get(i).getCost()))
                {
                    tmp = i;
                }
            }
            Collections.swap(neighbors, tmp, j);
        }
    }
    
}
