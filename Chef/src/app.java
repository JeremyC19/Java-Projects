public class app{
    public static void main(String [] args) {
        chef normalChef = new chef();
        normalChef.makeChicken();
        ItalianChef italianChef = new ItalianChef();
        italianChef.makeSoup();
        ChineseChef chineseChef = new ChineseChef();
        chineseChef.makeSpecialDish();
    }
}
