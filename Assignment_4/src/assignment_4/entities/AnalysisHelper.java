/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author prospace
 */

import java.util.*;
public class AnalysisHelper {
 
    public void threeBestCustomer(){
        int[] ans1 = {-1,-1,-1};
        int[] ans2 = {0,0,0};
       
        for (int tmpcusId : MasterOrder.getInstance().getCustomers().getCustomerDir().keySet()){
            Customer tmpcus = MasterOrder.getInstance().getCustomers().getCustomerDir().get(tmpcusId);
            int score = 0;
            for (Order j : tmpcus.getOrderList()){
                score += (j.getItem().getQuantity() * j.getItem().getSalesPrice());
            }
            
            int minf = 0;
            for (int i = 1; i < 3; i++)
                if (ans2[i] < ans2[minf]|| (ans2[i] == ans2[minf] && ans1[i] > ans1[minf]))
                    minf = i;
            if (ans2[minf] < score|| (score == ans2[minf] && tmpcusId < ans1[minf])){
                ans2[minf] = score;
                ans1[minf] = tmpcusId;
            }
            
        }
         //ans1[]tmpcusId,ans2[] score
            
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<3;i++){
                map.put(ans1[i],ans2[i]);
            }
            //sort
           List<Map.Entry<Integer,Integer>> smap = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(smap, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3 best customer: ");
        
        /*
        for (int i = 0; i<3 ;i++){
            if (ans1[i] == -1) continue;
               System.out.println(MasterOrder.getInstance().getCustomers().getCustomerDir().get(ans1[i]) + ", Buy = " + ans2[i]);
        }
        */
        
        for(Map.Entry<Integer, Integer> entry : smap){
             if (entry.getKey() == -1) continue;
               System.out.println(MasterOrder.getInstance().getCustomers().getCustomerDir().get(entry.getKey()) + ", Buy = " + entry.getValue());
            
        }
        
    }
    
    public void threeBestSalePerson(){
        int[] ans1 = {-1,-1,-1};
        int[] ans2 = {0,0,0};
        for (int spId : MasterOrder.getInstance().getSalesPerson().getSalesPersonDir().keySet()){
            SalesPerson tmpsp = MasterOrder.getInstance().getSalesPerson().getSalesPersonDir().get(spId);
            int score = 0;
            for (Order j : tmpsp.getOrderList()){
                score += (j.getItem().getQuantity() * (j.getItem().getSalesPrice() - MasterOrder.getInstance().getProduct().getProductDir().get(j.getItem().getProductId()).getMinPrice()));
            }
            
            int minf = 0;
            for (int i = 1; i < 3; i++)
                if (ans2[i] < ans2[minf]|| (ans2[i] == ans2[minf] && ans1[i] > ans1[minf]))
                    minf = i;
            if (ans2[minf] < score|| (score == ans2[minf] && spId < ans1[minf])){
                ans2[minf] = score;
                ans1[minf] = spId;
            }
        }
        
         Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<3;i++){
                map.put(ans1[i],ans2[i]);
            }
            //sort
           List<Map.Entry<Integer,Integer>> smap = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(smap, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3 best salePerson: ");
        
        /*
        for (int i = 0; i<3 ;i++){
            if (ans1[i] == -1) continue;
                System.out.println(MasterOrder.getInstance().getSalesPerson().getSalesPersonDir().get(ans1[i]) + ", Sales = " + ans2[i]);
        }
                */
        for(Map.Entry<Integer, Integer> entry :smap){
             if (entry.getKey() == -1) continue;
               System.out.println(MasterOrder.getInstance().getSalesPerson().getSalesPersonDir().get(entry.getKey()) + ", Sales = " + entry.getValue());
            
        }
        
    }
    
    public void threeBestSaleProduct(){
        int[] ans1 = {-1,-1,-1};
        int[] ans2 = {0,0,0};
        for (int proId : MasterOrder.getInstance().getProduct().getProductDir().keySet()){
            Product tmpsp = MasterOrder.getInstance().getProduct().getProductDir().get(proId);
            int score = 0;
            for (int j : MasterOrder.getInstance().getOrders().getOrderDir().keySet()){
                if (MasterOrder.getInstance().getOrders().getOrderDir().get(j).getItem().getProductId() == proId)
                    score += (MasterOrder.getInstance().getOrders().getOrderDir().get(j).getItem().getQuantity());
            }
            
            int minf = 0;
            for (int i = 1; i < 3; i++)
                if (ans2[i] < ans2[minf]|| (ans2[i] == ans2[minf] && ans1[i] > ans1[minf]))
                    minf = i;
            if (ans2[minf] < score|| (score == ans2[minf] && proId < ans1[minf])){
                ans2[minf] = score;
                ans1[minf] = proId;
            }
        }
        
        /*
        for (int i = 0; i<3 ;i++){
            for (int j = i; j>0; j--)
                if (ans2[j] > ans2[j - 1])
                {
                    int tt = ans1[j];
                    ans1[j] = ans1[j-1];
                    ans1[j-1] = tt;
                    tt = ans2[j];
                    ans2[j] = ans2[j-1];
                    ans2[j-1] = tt;
                }else {
                    break;
                }
        }
        */
        
         Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<3;i++){
                map.put(ans1[i],ans2[i]);
            }
            //sort
           List<Map.Entry<Integer,Integer>> smap = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(smap, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3 most popular product: ");

        /*
        for (int i = 0; i<3 ;i++){
            if (ans1[i] == -1) continue;
                System.out.println(MasterOrder.getInstance().getProduct().getProductDir().get(ans1[i]) + " quantity = " + ans2[i]);
        }
        */
        for(Map.Entry<Integer, Integer> entry : smap){
             if (entry.getKey() == -1) continue;
               System.out.println(MasterOrder.getInstance().getProduct().getProductDir().get(entry.getKey()) + "quantity = " + entry.getValue());
            
        }
        
    }

     public void threePopularProduct(){
        int[] ans1 = {-1,-1,-1};
        int[] ans2 = {0,0,0};

        for (int i : MasterOrder.getInstance().getProduct().getProductDir().keySet()){
            Product prod = MasterOrder.getInstance().getProduct().getProductDir().get(i);
           
            int quant = 0;
            
            for(int j: MasterOrder.getInstance().getOrders().getOrderDir().keySet()){
                Order ord = MasterOrder.getInstance().getOrders().getOrderDir().get(j);
                
                if(prod.getProductId() == ord.getItem().getProductId()){
                   quant += ord.getItem().getQuantity();
                }
                
            }
            
            int minf = 0;
            for (int z = 1; z < 3; z++)
                if (ans2[z] < ans2[minf]|| (ans2[z] == ans2[minf] && ans1[z] > ans1[minf]))
                    minf = z;
            if (ans2[minf] < quant|| (quant == ans2[minf] && i < ans1[minf])){
                ans2[minf] = quant;
                ans1[minf] = i;
            }
        }
        
         Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<3;i++){
                map.put(ans1[i],ans2[i]);
            }
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             if (entry.getKey() == -1) continue;
               System.out.println(entry.getKey()+" "+entry.getValue());
            
        }
            //sort
           List<Map.Entry<Integer,Integer>> smap = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(smap, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        
        /*
         for (int i = 0; i<3 ;i++){
            if (ans1[i] == -1) continue;
                System.out.println(MasterOrder.getInstance().getProduct().getProductDir().get(ans1[i]).getProductId() + " ");

        }
        */
        
        for(Map.Entry<Integer, Integer> entry : smap){
             //if (entry.getKey() == -1) continue;
               System.out.println(MasterOrder.getInstance().getProduct().getProductDir().get(entry.getKey()) + " ");
            
        }
         
    }
    
    public void totalRevenue(){
        int sum1 = 0;
        int sum2=0;
        int targetPrice= 0, salePrice = 0, quantity = 0;
        int minPrice=0;


//        int testId = MasterOrder.getInstance().getOrders().getOrderDir().get(20).getItem().productId;
//        System.out.println(testId+"%%%%%%%");

        for(int i: MasterOrder.getInstance().getOrders().getOrderDir().keySet()){
            Order tmp = MasterOrder.getInstance().getOrders().getOrderDir().get(i);
            int pid= tmp.getItem().getProductId();
//            if (pid == 20){
//                System.out.println(tmp.getOrderId());
//            }
            Product prod = MasterOrder.getInstance().getProduct().getProductDir().get(pid);
            if (prod == null){
                System.out.println(pid+"~~~~~~~~~~~~~~~");
            }
            targetPrice = prod.getTarPrice();
            minPrice=prod.getMinPrice();
            quantity = tmp.getItem().getQuantity();
            salePrice = tmp.getItem().getSalesPrice();

            int revenue1 = 0;
            int revenue2 =0;
            revenue1 = (salePrice-targetPrice)*quantity;
            revenue2 =(salePrice-minPrice)*quantity;
            sum1 += revenue1;
            sum2 += revenue2;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The total revenue is(salePrice-targetPrice):" + sum1);
        System.out.println("The total revenue is(salePrice-minPrice):" + sum2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
