package com.example.ttd

import junit.framework.Assert.assertEquals
import org.junit.Test

class SetOperationTest {
     var setop = SetOperation()

    @Test
    fun getSize(){
        setop.addItem(1)
        setop.addItem(2)
        assertEquals(2,setop.getSize())
    }

    @Test
    fun getCount(){
        assertEquals(1, setop.getCount())
    }
    @Test
    fun addItem(){
        setop.addItem(2)
        setop.addItem(3)
        assertEquals(3, setop.getSize())
    }
}