package org.iesra.model

class SmartphonePhotoFile (nombreOriginal: String): PhotoFile(nombreOriginal) {
    override val orderKey: String = nombreOriginal.substring(4, 12) + nombreOriginal.substring(13, 19)
}