import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionsUtils {

    /**
     *
     * @param collection any java.util.Collection class
     * @param obj the actual object in the specified collection
     * @return frequency
     * @param <T> any type
     */
    public static <T> int frequency(Collection<T> collection, Object obj){
        AtomicInteger freq = new AtomicInteger();

        // first solution
        for (Iterator<T> it = collection.iterator(); it.hasNext();){
            if (it.next().equals(obj))
                freq.incrementAndGet();
        }

        // second solution
        collection.forEach((object) -> {
            if (object.equals(obj))
                freq.incrementAndGet();
        });

        return freq.get();
    }

    /**
     *
     * @param collection any java.util.Collection class
     * @param <T> any type
     */
    public static <T> void print(Collection<T> collection){
        // first Solution
        for (Iterator<T> it = collection.iterator(); it.hasNext();)
            System.out.println(it.next());

        // second solution
        collection.forEach(System.out::println);
    }


    /**
     *
     * @param collection any java.util.Collection class
     * @return last object or null
     * @param <T> any type
     */
    public static <T> Object getLastObject(Collection<T> collection){
        Object obj = null;

        // first solution
        for (Iterator<T> it = collection.iterator(); it.hasNext();){
            obj = it.next();
        }
        return obj;

       //  second solution
//        Iterator<T> it = collection.iterator();
//        while (it.hasNext())
//            obj = it.next();
//
//        return obj;

    }

    /**
     *
     * @param collection any java.util.Collection class except for Sets
     * @param index the specified position of the object
     * @return Object or null
     * @param <T> any type
     */


    public static <T> Object getElementAt(Collection<T> collection, int index){
        int i = 0;
        int size = collection.size();
        Object currentObject = null;
        Object obj = null;

        // my solution
        for (Iterator<T> it = collection.iterator(); it.hasNext();){
            if (index > size - 1){
                return null;
            }
            currentObject = it.next();

            if (index == i){
                obj = currentObject;
            }
            ++i;
        }
        return obj;
    }


    /**
     *
     * @param collection any java.util.Collection class
     * @param <T> any type
     */
    public static <T> void removeLast(Collection<T> collection){
        Object obj = null;

        // first solution
        for (Iterator<T> it = collection.iterator(); it.hasNext();){
            obj = it.next();
        }
        if (obj == null) return;
        collection.remove(obj);

        // second solution
//        Iterator<T> it = collection.iterator();
//
//        while (it.hasNext())
//            obj = it.next();
//
//        if (obj == null) return;
//        collection.remove(obj);
    }
}
