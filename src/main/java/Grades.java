public class Grades {
    private int[] grades;
    private int size;
    private int last;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;


    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;

    }

    public setLast(int[]) {
        if (this.size == 10) {
            this.last = grades[-1]
            return last;

        }


    }

    public void setAverage(float average) {
    }
}
