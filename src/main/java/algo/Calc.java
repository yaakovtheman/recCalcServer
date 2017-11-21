package algo;

import pojo.Board;
import pojo.Order;
import pojo.Point;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Calc {



    int sourceW;
    int sourceH;

    public List<Board> getMeasurements(List<Order> orders){

        LinkedList<Order> remainingOrders = new LinkedList<Order>(orders);
        //List<Order> remainingOrders = orders;

        for (;!remainingOrders.isEmpty();){

            insert(remainingOrders.getFirst());
        }


        return null;
    }

    private void insert(Order o){

        for (int i = 0; i<o.getAmmount(); i++){

        }

    }

    private class Result{
        public void setRowIndex(int rowIndex) {
            this.rowIndex = rowIndex;
        }

        List<Point> points = new ArrayList<Point>();
        int rowIndex = 0;

        public List<Point> getPoints() {
            return points;
        }

        public int getRowIndex() {
            return rowIndex;
        }
    }

}
