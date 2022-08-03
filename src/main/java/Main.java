public class Main {
    public static void main(String[] args){
        String thanks = "Thank You,";
        String name = "Brandon!";
        String order = "Your order number is #";
        int previousOrder = 715;

        int thisOrder = ++previousOrder;
        String[] items = {"Double Cheeseburger", "Lrg Fries", "Lrg Coke", "McFlurry", "Big Mac", "Med Fries", "Med Fanta"};

        System.out.println(thanks + " " + name.toUpperCase()+"\n"+order+thisOrder+"\n-------------------------\nYou Ordered:\n");

        for(int i = 0; i< items.length;i++){
            if (items[i].contains("Lrg")||items[i].contains("Med")){
                items[i] = "   + "+items[i];
                System.out.println(items[i]);
            }
            else{
                System.out.println("x1 "+items[i]);
            }
        }
    }
}