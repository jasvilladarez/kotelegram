# Kotelegram
A Kotlin wrapper for Telegram Bot API.
Currently, it still doesn't support web hooks.

# Usage
## Instantiating a bot
```
telegramBot(*<bot token>*) {
  // insert command listeners here
}
```

## Listening for commands
```
command("/start") {
  // do something when command is received
}
```

## Starting the bot
```
telegramBot(*<bot token>*) {
  command("/start") {
    // do something when command is received
  }
}.startPolling()
```

# Download
From `jcenter()`
```
depedencies {
  compile 'io.github.jasvilladarez:kotelegram:0.1'
}
```
From **Jitpack**
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

depedencies {
  compile 'com.github.jasvilladarez:kotelegram:0.1'
}
```
