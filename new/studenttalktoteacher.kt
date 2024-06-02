import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.app.R

@Composable
fun MyScreen() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val (
            yellowBackgroundTwo, yellowBackgroundOne, chatText,
            teacherWords, studentWords, teacherResponse,
            dateButton, textField, volumeOne, volumeTwo,
            imageButton3, keyboardButton, formButton, mikeButton
        ) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.yellowbackground),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(541.dp)
                .height(306.dp)
                .constrainAs(yellowBackgroundTwo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Image(
            painter = painterResource(id = R.drawable.yellowbackground),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(475.dp)
                .height(239.dp)
                .constrainAs(yellowBackgroundOne) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.317f
                }
        )

        Text(
            text = "與老師聊天",
            fontSize = 50.sp,
            modifier = Modifier
                .width(262.dp)
                .height(86.dp)
                .constrainAs(chatText) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.013f
                }
        )

        Text(
            text = "老師的話",
            fontSize = 50.sp,
            modifier = Modifier
                .constrainAs(teacherWords) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.216f
                }
        )

        Text(
            text = "小明你今天很棒喔~",
            fontSize = 35.sp,
            modifier = Modifier
                .width(372.dp)
                .height(99.dp)
                .constrainAs(studentWords) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.379f
                }
        )

        Text(
            text = "給老師的話",
            fontSize = 50.sp,
            modifier = Modifier
                .constrainAs(teacherResponse) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.685f
                }
        )

        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .width(229.dp)
                .height(62.dp)
                .constrainAs(dateButton) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.14f
                }
        ) {
            Text(text = "▶ 2024/05/12", fontSize = 25.sp)
        }

        TextField(
            value = "",
            onValueChange = { /* TODO */ },
            placeholder = { Text("新增留言") },
            modifier = Modifier
                .width(362.dp)
                .height(56.dp)
                .constrainAs(textField) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.791f
                }
        )

        Image(
            painter = painterResource(id = R.drawable.volume),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(54.dp)
                .height(53.dp)
                .background(Color.Transparent)
                .constrainAs(volumeOne) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.955f
                    horizontalBias = 0.98f
                }
        )

        Image(
            painter = painterResource(id = R.drawable.volume),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(54.dp)
                .height(53.dp)
                .background(Color.Transparent)
                .constrainAs(volumeTwo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.955f
                    horizontalBias = 0.582f
                }
        )

        Image(
            painter = painterResource(id = R.drawable.volume),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .wrapContentSize()
                .background(Color.Transparent)
                .constrainAs(imageButton3) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.976f
                    horizontalBias = 0.569f
                }
        )

        Image(
            painter = painterResource(id = R.drawable.keyboard),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(68.dp)
                .height(51.dp)
                .background(Color.Transparent)
                .constrainAs(keyboardButton) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.955f
                    horizontalBias = 0.979f
                }
        )

        Image(
            painter = painterResource(id = R.drawable.form),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(94.dp)
                .height(82.dp)
                .background(Color.Transparent)
                .constrainAs(formButton) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.01f
                    horizontalBias = 0.009f
                }
        )

        Image(
            painter = painterResource(id = R.drawable.mm),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(55.dp)
                .height(54.dp)
                .background(Color.Transparent)
                .constrainAs(mikeButton) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 0.955f
                    horizontalBias = 0.77f
                }
        )
    }
}
