package com.example.exercise_10

object SettingsDataForRecycler {

    data class Item(
        val icon: Int,
        val name: String,
    )

    private val items: MutableList<Item> = mutableListOf()

    fun getItems(): MutableList<Item> {
        items.apply {
            add(Item(R.drawable.ic_edit_profile, "Edit Profile"))
            add(Item(R.drawable.ic_address, "Address"))
            add(Item(R.drawable.ic_notification, "Notification"))
            add(Item(R.drawable.ic_payment, "Payment"))
            add(Item(R.drawable.ic_security, "Security"))
            add(Item(R.drawable.ic_language, "Language"))
            add(Item(R.drawable.ic_dark_mode, "Dark Mode"))
            add(Item(R.drawable.ic_privacy_policy, "Privacy Policy"))
            add(Item(R.drawable.ic_help_center, "Help Center"))
            add(Item(R.drawable.ic_invite_friends, "Invite Friends"))
            add(Item(R.drawable.ic_logout, "Logout"))
        }
        return items
    }
}