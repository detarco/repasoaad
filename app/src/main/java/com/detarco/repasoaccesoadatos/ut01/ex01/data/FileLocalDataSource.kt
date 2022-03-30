package com.detarco.repasoaccesoadatos.ut01.ex01.data

import android.content.Context
import java.io.File

class FileLocalDataSource(
    private val context: Context
) : FileRepository {

    //Create File
    private fun getFile(fileName: String): File {
        val file = File(context.filesDir, fileName)
        if (!file.exists()) {
            file.createNewFile()
        }
        return file
    }

    //Add info on File
    override fun addInfo(content: String) {
        getFile(REPASOFILE).appendText(
            content + System.lineSeparator()
        )
    }

    //Delete info on File
    override fun delInfo() {
        getFile(REPASOFILE).writeText("")
    }

    //Update info on File
    override fun updateInfo(update: String) {
        getFile(REPASOFILE).writeText(
            update + System.lineSeparator()
        )
    }

    //Create Folders
    override fun addFolder() {
        val oneMoreFolder = File(
            context.getExternalFilesDir(
                "PlusOneFolder"
            ), "NeedsAChild.txt"
        )
        oneMoreFolder.writeText("One Child")
    }

    //Create Files in the Folder of the app or the cache
    override fun addFileToFolder() {
        val oneMoreFileInFolder = File(
            context.getExternalFilesDir(
                "PlusOneFolder"
            ), "OneMoreChild.txt"
        )
        oneMoreFileInFolder.writeText("One More Child")
    }

    override fun addCache() {
        val cache = File(
            context.cacheDir,
            "Cache.txt"
        )
        cache.writeText("Cache")
    }

    //Create internal or external Files
    override fun internalFile() {
        val internalFile = File(context.cacheDir, "InternalFileInCache.txt")
        internalFile.writeText("Internal File")
    }

    override fun externalFile() {
        val externalFile = File(
            context.getExternalFilesDir(
                "ExternalFolder"
            ), "ExternalFileInFolder.txt"
        )
        externalFile.writeText("External File")
    }

    companion object {
        const val REPASOFILE: String = "ut01_files_repaso.txt"
    }
}