package fr.android.androidexercises

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verifyAll
import org.junit.Before
import org.junit.Test

class LoginPresenterTest {

    // TODO test login presenter with JUnit and MockK
    @RelaxedMockK
    private lateinit var activity: LoginActivity
    private lateinit var presenter: LoginPresenter
    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        presenter = LoginPresenter(activity)
    }
    @Test
    fun password_should_be_valid_1() {
        // WHEN
        presenter.checkCredentials("my pass")
        // THEN
        verifyAll {
            activity.logged()
            activity.message(R.string.text_logged)
        }
    }
    @Test
    fun password_should_be_valid_2() {
        // WHEN
        presenter.checkCredentials("pas")
        // THEN
        verifyAll {
            activity.logged()
            activity.message(R.string.text_logged)
        }
    }
    @Test
    fun password_should_not_be_valid_1() {
        // WHEN
        presenter.checkCredentials("my")
        // THEN
        verifyAll {
            activity.notLogged()
            activity.message(R.string.notLogged)
        }
    }
    @Test
    fun password_should_not_be_valid_2() {
        // WHEN
        presenter.checkCredentials(null)
        // THEN
        verifyAll {
            activity.notLogged()
            activity.message(R.string.notLogged)
        }
    }
}