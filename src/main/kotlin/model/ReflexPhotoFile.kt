package org.iesra.model

class ReflexPhotoFile (nombreOriginal: String): PhotoFile(nombreOriginal) {
    override val orderKey: String = "20" + nombreOriginal.substring(5, 7) + nombreOriginal.substring(3, 5) + nombreOriginal.substring(1,3) + nombreOriginal.substring(8, 14)
}