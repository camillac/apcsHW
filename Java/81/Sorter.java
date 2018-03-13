public abstract class Sorter {
    private Comparable[] data;

    public Sorts( Comparable[] usersData) {
        data = new Comparable[ usersData.length];
        for( int i = 0; i < usersData.length; i++)
            data[i] = usersData[i];
    }
    
    public String toString() {
        String result = "[";
        for( Comparable d : data)
            result += d + ",";
        return result + "]";
    }
    
    public boolean isSorted() {
        for( int i = 0
           ; i < data.length-1 // stop early, because comparing to next
           ; i++
           )
            if( data[i].compareTo( data[ i+1]) > 0) return false;
        return true;
    }

    public abstract void sort();
}
    

    
