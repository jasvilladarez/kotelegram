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
Add `jcenter()` to repositories and add the following
```
depedencies {
  compile 'io.github.jasvilladarez:kotelegram:0.1'
}
```
