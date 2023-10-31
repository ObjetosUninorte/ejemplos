/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uninorte.simpleobserver.ConcreateObserver;
import uninorte.simpleobserver.ConcreteSubject;

/**
 *
 * @author salaz
 */
public class SimpleObserverTest {


    @Test
    public void observerRegistrationTest() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreateObserver observer1 = new ConcreateObserver(subject);
        assertEquals(1, subject.getObserverCount());
    }

    @Test
    public void observerUnregistrationTest() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreateObserver observer1 = new ConcreateObserver(subject);
        assertEquals(1, subject.getObserverCount());
        subject.removeObserver(observer1);
        assertEquals(0, subject.getObserverCount());
    }

    @Test
    public void observerUpdateTest() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreateObserver observer1 = new ConcreateObserver(subject);
        assertEquals(1, subject.getObserverCount());
        subject.setState(1);
        assertEquals(1, subject.getState());
        assertEquals(1, observer1.getNotifyCount());
    }

    @Test
    public void oneSubjectMultipleObserverTest() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreateObserver observer1 = new ConcreateObserver(subject);
        ConcreateObserver observer2 = new ConcreateObserver(subject);
        assertEquals(2, subject.getObserverCount());
        subject.setState(1);
        assertEquals(1, subject.getState());
        subject.setState(2);
        assertEquals(2, subject.getState());
        assertEquals(2, observer1.getNotifyCount());
        assertEquals(2, observer2.getNotifyCount());
    }

    @Test
    public void multipleSubjectMultipleObserverTest() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreateObserver observer = new ConcreateObserver(subject);
        ConcreteSubject subject2 = new ConcreteSubject();
        ConcreateObserver observer2 = new ConcreateObserver(subject2);
        assertEquals(1, subject.getObserverCount());
        assertEquals(1, subject2.getObserverCount());
        subject.setState(1);
        assertEquals(1, observer.getNotifyCount());
        assertEquals(0, observer2.getNotifyCount());
        subject2.setState(1);
        assertEquals(1, observer.getNotifyCount());
        assertEquals(1, observer2.getNotifyCount());
    }

}
