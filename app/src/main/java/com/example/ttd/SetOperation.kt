package com.example.ttd

class SetOperation :SetImplementation {
     var mutableSet= mutableSetOf<Int>()
    override fun getSize():Int {
        return mutableSet.size
    }

    override fun getCount():Int{
        return mutableSet.count()
    }

    override fun addItem(i:Int) {
        mutableSet.add(i)
    }
}