package com.magicgoop.tagpshere.example.util

object LoremIpsum {
    val list =
        "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세. 무궁화 삼천리 화려 강산 대한 사람, 대한으로 길이 보전하세. 남산 위에 저 소나무, 철갑을 두른 듯 바람 서리 불변함은 우리 기상일세. 무궁화 삼천리 화려 강산 대한 사람, 대한으로 길이 보전하세."
//            .replace("[^a-zA-Z\\s]".toRegex(), "")
            .replace("\\s+".toRegex(), " ")
            .split(" ")
}