package section8.code17

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  supervisorScope {
    async(CoroutineName("Coroutine1")) {
      throw Exception("Coroutine1에 예외가 발생했습니다")
    }
    launch(CoroutineName("Coroutine2")) {
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행")
    }
  }
}