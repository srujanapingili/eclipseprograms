package tharalika;
public class Apple implements Comparable<Apple> {
    private String variety;
      private int weight;
    @Override
    public int compareTo(Apple other) {
        if (this.weight < other.weight) {
            return -1;
        }
        if (this.weight == other.weight) {
            return 0;
        }
        return 1;
    }



	}


