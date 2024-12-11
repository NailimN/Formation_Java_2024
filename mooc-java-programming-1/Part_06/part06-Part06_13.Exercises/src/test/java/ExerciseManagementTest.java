/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author milia
 */
public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    private Exercise exercise;
    

    @Before
    public void initialize() {
        management = new ExerciseManagement();
        exercise = new Exercise("exercice mal expliqué");
    }

    @Test
    public void exerciseListEmptyAtBeginning() {

        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {

        management.add("");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {

        management.add("");
        assertTrue(management.exerciseList().contains(""));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("");
        management.markAsCompleted("");
        assertTrue(management.isCompleted(""));
    }
    
}
