@file:JvmName("Main")
/**
 * Getemall-client-UI entry point.
 *
 * Created by miquifant on 2020-12-03
 */
package miquifant.getemall

import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource


fun main() = Window {
  Image (
    bitmap = imageResource("medal.jpg"), // ImageBitmap
    modifier = Modifier.fillMaxSize()
  )
  var text by remember { mutableStateOf("Hello, World!") }

  MaterialTheme {
    Button(onClick = {
      text = "Hello, Desktop!"
    }) {
      Text(text)
    }
  }
}
