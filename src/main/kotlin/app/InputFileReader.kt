package org.iesra.app

import java.nio.file.Path
import java.nio.file.Files

class InputFileReader {
    fun leer(path: Path): List<String> = Files.readAllLines(path)
}