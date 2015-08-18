import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {

    @Test
    public void addingAnItemIncreasesSize(){
        PriorityQueue priQ = new PriorityQueue();

        priQ.add(27);
        priQ.add(33);
        priQ.add(30);

        assertThat(priQ.size(), is(3));
    }

    @Test
    public void itemsAreRemovedWhenTaken(){
        PriorityQueue priQ = new PriorityQueue();

        priQ.add(27);
        priQ.add(33);
        priQ.add(30);

        priQ.take();
        priQ.take();

        assertThat(priQ.size(), is(1));
    }

    @Test
    public void itemsAreRemovedInAscendingOrder(){
        PriorityQueue priQ = new PriorityQueue();

        priQ.add(27);
        priQ.add(33);
        priQ.add(30);

        assertThat(priQ.take(), is(27));
        assertThat(priQ.take(), is(30));
        assertThat(priQ.take(), is(33));
    }
}
