package com.lzy.fastdevelopkotlin.test

import java.io.Serializable

/**
 *
 * @author: cyli8
 * @date: 2019/2/12 15:50
 */
data class User(val name: String) : Serializable {
    constructor() : this("")
}