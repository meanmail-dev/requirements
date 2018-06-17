package ru.meanmail


import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NonNls
import javax.swing.Icon


object RequirementsFileType : LanguageFileType(RequirementsLanguage) {
    
    @NonNls
    val DEFAULT_EXTENSION = "txt"
    
    override fun getName(): String {
        return "requirements.txt"
    }
    
    override fun getDescription(): String {
        return "Requirements language"
    }
    
    override fun getDefaultExtension(): String {
        return DEFAULT_EXTENSION
    }
    
    override fun getIcon(): Icon? {
        return AllIcons.FILE
    }
    
}