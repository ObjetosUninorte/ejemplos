import com.uninorte.uicomponents.Button;
import com.uninorte.uicomponents.Row;
import com.uninorte.uicomponents.Text;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UIComponentTest {
    
    @Test
    public void testChildrenCount() {
        Button button = new Button(1, 0, 0, 100, 100, new Text(2, 0, 0, 100, 100));
       
        Row row = new Row(3, 0, 0, 100, 100);
        row.addChild(button);
        Assertions.assertEquals(1, row.getChildCount());
    }
}
