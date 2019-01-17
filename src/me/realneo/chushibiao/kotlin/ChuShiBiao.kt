@file:Suppress("NonAsciiCharacters", "LocalVariableName", "FunctionName", "ClassName", "PropertyName", "EnumEntryName", "PrivatePropertyName")

package me.realneo.chushibiao.kotlin

/*
* Developed by Neo on 1/16/19 8:34 PM.
* Last modified 1/16/19 8:34 PM.
* Copyright (c) 2019. All rights reserved.
*/

fun main(args: Array<String>) {
    val 先帝 = 君()
    val 陛下 = 君()
    val 文景 = 君()
    val 桓灵 = 君()

    val 益州 = 国()
    val 先汉 = 国()
    val 后汉 = 国()


    先帝.创业(0.49)
    益州.国运 = 气候.疲敝
    println("此诚危急存亡之秋也！")

    if (侍中().郭攸之.追先帝之殊遇() && 侍中().郭攸之.报之于陛下())
        侍中().郭攸之.不懈于内()
    if (侍中().费祎.追先帝之殊遇() && 侍中().费祎.报之于陛下())
        侍中().费祎.不懈于内()
    if (侍郎().董允.追先帝之殊遇() && 侍郎().董允.报之于陛下())
        侍郎().董允.不懈于内()
    if (中都督().向宠.追先帝之殊遇() && 中都督().向宠.报之于陛下()) {
        中都督().向宠.忘身于外()
    }

    if (陛下.为君 == 王道.明) {
        陛下.开张圣听()
        陛下.恢弘志士之气()
    } else {
        陛下.妄自菲薄()
        陛下.引喻失义()
    }

    陛下.治国()
    val 宫中 = false
    val 府中 = false
    val 陟臧 = false
    val 罚否 = false
    assert(宫中 == 府中)
    assert(陟臧 == 罚否)

    val 作奸犯科者 = 侍卫之臣(臣德.奸)
    val 为忠善者 = 侍卫之臣(臣德.贤)
    if (陛下.为君 == 王道.明) {
        益州.付诸有司论其刑赏(作奸犯科者)
        益州.付诸有司论其刑赏(为忠善者)
    } else {
        陛下.偏私()
    }

    if (侍中().郭攸之.为臣 == 臣德.贤 && 侍中().费祎.为臣 == 臣德.贤 && 侍郎().董允.为臣 == 臣德.贤) {
        println("此皆良实，志虑忠纯，是以先帝简拔以遗陛下。")
    }

    val 宫中之事 = 事()
    if (陛下.咨之(宫中之事) && 侍中().郭攸之.谋事(宫中之事) && 侍中().费祎.谋事(宫中之事) && 侍郎().董允.谋事(宫中之事)) {
        陛下.施行(宫中之事)
        println("裨补阙漏，有所广益!")
    }

    if (中都督().向宠.为臣 == 臣德.贤) {
        println("性行淑均，晓畅军事。")
        println("先帝称之曰：")
        先帝.曰("能")
        println("是以众议举宠为督。")
    }

    val 营中之事 = 事()
    if (陛下.咨之(营中之事)) {
        陛下.施行(营中之事)
        println("行阵和睦，优劣得所!")
    }

    文景.亲贤臣远小人()
    先汉.国运 = 气候.兴隆
    桓灵.亲小人远贤臣()
    后汉.国运 = 气候.倾颓

    do {
        先帝.每与臣论此事()
    } while (先帝.在)

    if (侍中().郭攸之.为臣 == 臣德.贤 && 侍中().费祎.为臣 == 臣德.贤 && 侍郎().董允.为臣 == 臣德.贤) {
        println("此悉贞良死节之臣，愿陛下亲之信之，则汉室之隆，可计日而待也。")
    }

    丞相().诸葛亮.回首往事()
    丞相().诸葛亮.表忠心()
    丞相().诸葛亮.请战()
    丞相().诸葛亮.道别()
}

internal enum class 王道 { 明, 昏 }

internal class 君 {
    var 在: Boolean = true
    var 为君: 王道 = 王道.明

    fun 创业(percentage: Double): Boolean {
        return if (percentage < 0.5) {
            在 = false
            println("崩殂！")
            false
        } else {
            println("兴复汉室，还于旧都！")
            true
        }
    }

    fun 开张圣听() {
        println("光先帝遗德！")
    }

    fun 恢弘志士之气() {}

    fun 妄自菲薄() {}

    fun 引喻失义() {
        println("塞忠谏之路！")
    }

    fun 亲贤臣远小人() {
        为君 = 王道.明
    }

    fun 亲小人远贤臣() {
        为君 = 王道.昏
    }

    fun 治国() {}

    fun 偏私() {
        println("内外异法！")
    }

    @Suppress("UNUSED_PARAMETER")
    fun 咨之(事: 事): Boolean {
        return 为君 == 王道.明
    }

    @Suppress("UNUSED_PARAMETER")
    fun 施行(事: 事): Boolean {
        return true
    }

    fun 曰(言: String) {
        println(言)
    }

    fun 每与臣论此事() {
        println("叹息痛恨于桓灵。")
    }
}

internal enum class 臣德 { 贤, 奸 }

internal open class 臣(var 为臣: 臣德) {
    private var 刘备 = 君()
    private var 刘禅 = 君()

    fun 追先帝之殊遇(): Boolean {
        return 刘备.为君 == 王道.明
    }

    fun 报之于陛下(): Boolean {
        return 刘禅.为君 == 王道.明
    }

    @Suppress("UNUSED_PARAMETER")
    fun 谋事(事: 事): Boolean {
        return 为臣 == 臣德.贤
    }
}

internal class 侍卫之臣(为臣: 臣德) : 臣(为臣) {
    fun 不懈于内() {
        println("不懈于内!")
    }

    fun 回首往事() {
        println("臣本布衣，躬耕于南阳，苟全性命于乱世，不求闻达于诸侯。先帝不以臣卑鄙，猥自枉屈，三顾臣于草庐之中，咨臣以当世之事，由是感激，遂许先帝以驱驰。后值倾覆，受任于败军之际，奉命于危难之间，尔来二十有一年矣。")
    }

    fun 表忠心() {
        println("先帝知臣谨慎，故临崩寄臣以大事也。受命以来，夙夜忧叹，恐托付不效，以伤先帝之明，故五月渡泸，深入不毛。")
    }

    fun 请战() {
        println("今南方已定，兵甲已足，当奖率三军，北定中原，庶竭驽钝，攘除奸凶，兴复汉室，还于旧都。")
    }

    fun 道别() {
        println("今当远离，临表涕泣，不知所云。")
    }
}

internal enum class 气候 { 兴盛, 疲敝, 兴隆, 倾颓 }

internal class 国 {
    var 国运 = 气候.兴盛

    fun 付诸有司论其刑赏(臣: 侍卫之臣) {
        if (臣.为臣 == 臣德.贤)
            println("赏！")
        else
            println("刑！")
    }
}

internal class 忠志之士(为臣: 臣德) : 臣(为臣) {
    fun 忘身于外() {
        println("忘身于外!")
    }
}

internal class 事

internal class 侍中 {
    var 郭攸之 = 侍卫之臣(臣德.贤)
    var 费祎 = 侍卫之臣(臣德.贤)
}

internal class 侍郎 {
    var 董允 = 侍卫之臣(臣德.贤)
}

internal class 中都督 {
    var 向宠 = 忠志之士(臣德.贤)
}

internal class 丞相 {
    var 诸葛亮 = 侍卫之臣(臣德.贤)
}