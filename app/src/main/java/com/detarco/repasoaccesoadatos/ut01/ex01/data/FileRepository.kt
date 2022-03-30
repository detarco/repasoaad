package com.detarco.repasoaccesoadatos.ut01.ex01.data

interface FileRepository {

    fun addInfo(content: String)

    fun delInfo()

    fun updateInfo(update: String)

    fun addFolder()

    fun addFileToFolder()

    fun addCache()

    fun internalFile()

    fun externalFile()

}