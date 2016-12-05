import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PubTest{
  Pub pub;
  Punter punter;

  @Before
  public void before() {
    pub = new Pub("The Green Dragon");
    punter = new Punter();
  }

  @Test
  public void hasName(){
    assertEquals("The Green Dragon", pub.getName());
  }

  @Test
  public void pubStartsEmpty(){
    assertEquals(0, pub.punterCount());
  }

  @Test 
  public void canTakePunter(){
    pub.enter(punter);
    assertEquals(1, pub.punterCount());
  }

    @Test
    public void punterCannotEnterWhenFull(){
      for(int i = 0; i < 40; i ++) {
        pub.enter(punter);
      }
    assertEquals(20, pub.punterCount());
  }

  @Test
  public void pubIsFull() {
    for (int i = 0; i < 20; i++) {
      pub.enter(punter);
    }
    assertEquals(true, pub.capacityFull());
  }

  @Test
  public void emptyPubAfterShut(){
    pub.enter(punter);
    assertEquals(1, pub.punterCount());
    pub.close();
    assertEquals(0, pub.punterCount());
  }
}