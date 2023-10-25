public class PcTest {
    @Test
    public void testChildrenCount() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        	machine.addDeviceCard(0);
            Assertions.assertEquals(1, machine.getCardCount());
    }
}
