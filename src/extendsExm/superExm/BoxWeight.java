package extendsExm.superExm;

class BoxWeight extends Box {
    //让我们复习super( )中的关键概念。当一个子类调用super( )，它调用它的直接超类的构
    //造函数。这样，super( )总是引用调用类直接的超类。这甚至在多层次结构中也是成立的。
    //还有，super( )必须是子类构造函数中的第一个执行语句。
    double weight; // weight of box
    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }
    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }
    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
