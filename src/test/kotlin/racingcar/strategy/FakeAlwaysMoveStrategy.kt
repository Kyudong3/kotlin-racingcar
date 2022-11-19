package racingcar.strategy

class FakeAlwaysMoveStrategy : MoveStrategy {
    override fun isPossibleMove(): Boolean = true

    override fun getDistance(): Int = 1
}
