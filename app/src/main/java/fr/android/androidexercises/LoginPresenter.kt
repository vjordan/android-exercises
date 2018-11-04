package fr.android.androidexercises

class LoginPresenter(private val activity: LoginActivity) {

    fun checkCredentials(password: String?) {
        if (password != null && password.length >= 3) {
            activity.logged()
            activity.message(R.string.text_logged)
        } else {
            activity.notLogged()
            activity.message(R.string.notLogged)
        }
    }
}
