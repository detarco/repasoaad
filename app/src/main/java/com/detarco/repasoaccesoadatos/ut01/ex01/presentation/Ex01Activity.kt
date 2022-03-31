package com.detarco.repasoaccesoadatos.ut01.ex01.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.detarco.repasoaccesoadatos.R
import com.detarco.repasoaccesoadatos.ut01.ex01.data.FileLocalDataSource
import com.detarco.repasoaccesoadatos.ut01.ex01.data.FileRepository

class Ex01Activity : AppCompatActivity() {

    private val fileLocalDataSource: FileRepository by lazy {
        FileLocalDataSource(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fileExercises()
    }

    private fun fileExercises() {
        //fileLocalDataSource.addInfo("Extra Info")
        //fileLocalDataSource.delInfo()
        //fileLocalDataSource.updateInfo("Updated Info")
        //fileLocalDataSource.addFolder()
        //fileLocalDataSource.addFileToFolder()
        //fileLocalDataSource.addCache()
        //fileLocalDataSource.internalFile()
        fileLocalDataSource.externalFile()
        fileLocalDataSource.getInfo().forEach {
            Log.d("@dev", it)
        }
    }
}