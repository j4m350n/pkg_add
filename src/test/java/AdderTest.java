import com.github.j4m350n.Adder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdderTest {

	@Test
	public void adds() {
		Assertions.assertEquals(3, Adder.add(1, 2));
	}

}