/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.entities.*;
import java.io.IOException;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {
    DataGenerator generator;
    DataReader orderReader;
    DataReader productReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
    }
    
    
    private void readData() throws IOException{
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        String[] orderRow;
        printRow(orderReader.getFileHeader());
        while((orderRow = orderReader.getNextRow()) != null){
            printRow(orderRow);
            
            MasterOrder.getInstance().getOrders().addOrder(
                    new Order(
                            Integer.parseInt(orderRow[0]),//orderId;
                            Integer.parseInt(orderRow[4]),//spId;
                            Integer.parseInt(orderRow[5]),//customerId
                            new Item(
                                    Integer.parseInt(orderRow[2]),//productId;
                                    Integer.parseInt(orderRow[6]),//salesPrice;
                                    Integer.parseInt(orderRow[3])//quantity
                            )
                    )
            );
            MasterOrder.getInstance().getCustomers().addCustomer(
                    new Customer(
                            Integer.parseInt(orderRow[5])
                    )
            );
            
            MasterOrder.getInstance().getSalesPerson().addSalesPerson(
                    new SalesPerson(
                            Integer.parseInt(orderRow[4])
                    )
            );
        }
        System.out.println("_____________________________________________________________");
        String[] prodRow;
        printRow(productReader.getFileHeader());
        while((prodRow = productReader.getNextRow()) != null){
            printRow(prodRow);
            MasterOrder.getInstance().getProduct().addProduct(
                    new Product(
                            Integer.parseInt(prodRow[0]),//int productId;
                            Integer.parseInt(prodRow[1]),//int minPrice;
                            Integer.parseInt(prodRow[2]),//int maxPrice;
                            Integer.parseInt(prodRow[3]) //int tarPrice;
                    )
            );
        }
        for (int tmpOrderId : MasterOrder.getInstance().getOrders().getOrderDir().keySet()){
            Order tmpOrder = MasterOrder.getInstance().getOrders().getOrderDir().get(tmpOrderId);
            //System.out.println(tmpOrder.getItem().getQuantity() + "  " + tmpOrder.getOrderId());
            MasterOrder.getInstance().getCustomers().getCustomerDir().get(tmpOrder.getCustomerId()).addOrder(tmpOrder);
            MasterOrder.getInstance().getSalesPerson().getSalesPersonDir().get(tmpOrder.getSupplierId()).addOrder(tmpOrder);
        }
        
        runAnalysis();
        
    }
    
    public static void main(String args[]) throws IOException{
        GateWay Ass4 = new GateWay();
        Ass4.readData();
    }
    
    public static void printRow(String[] row){
        for (String row1 : row) {
            System.out.print(row1 + ", ");
        }
        System.out.println("");
    }
    void runAnalysis(){
        
        helper.threeBestSaleProduct();
        helper.threeBestCustomer();
        helper.threeBestSalePerson();
        helper.totalRevenue();
    }
}
