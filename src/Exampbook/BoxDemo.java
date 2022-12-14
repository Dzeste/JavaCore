package Exampbook;

class Box {
    double width;
    double height;
    double depth;
}

class DemoBox{
    public static void main(String args[]){
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println(vol);
    }
}
