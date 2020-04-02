public class test {
    public static void main(String[] args) {
        List list1 = new List();
        //插入
        for (var i = 0;i < 10;i++){
            list1.insert(i,i);
        }
        //打印
        list1.printList();
        //获取长度
        System.out.println(list1.getLength());
        //根据下标查数据，下标越界
      //  System.out.println(list1.getIndexData(50));
        //根据下标查数据，下标正常
        System.out.println(list1.getIndexData(9));
        System.out.println(list1.getIndexData(0));
        System.out.println(list1.getIndexData(5));
        //根据数据查下标，下标越界
        list1.getDataIndex(50);
        //根据数据查下标，下标正常
        list1.getDataIndex(0);
        list1.getDataIndex(9);
        list1.getDataIndex(5);
        //更改数据，下标越界
        //list1.update(60,59);
        //更改数据下标正常
        list1.update(0,789);
        list1.update(9,456);
        list1.update(6,123);
        //删除数据，下标越界
      //  list1.delete(50);
        //删除数据，下标正常
        list1.delete(4);
        list1.delete(0);
        list1.delete(7);
        list1.printList();
    }
}
