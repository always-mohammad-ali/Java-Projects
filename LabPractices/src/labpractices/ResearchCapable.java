
package labpractices;


public interface ResearchCapable {
    public void conductResearch();
    public void publishPaper(String title);
    public String getResearchArea();
}

SmartTV extends EntertainmentDevice implements Connectable
- channel: int
- appList: String[]
+ changeChannel(newChannel: int): void
+ launchApp(appName: String): void
+ getStatus(): String
+ playContent(): void
+ connectToWifi(): void
+ getConnectionStatus(): String

SmartSpeaker extends EntertainmentDevice implements VoiceControllable
- currentSong: String
+ playSong(songName: String): void
+ getStatus(): String
+ playContent(): void
+ processVoiceCommand(command: String): void
+ getSupportedCommands(): String[]

SecurityCamera extends SecurityDevice implements Connectable, VoiceControllable
- isRecording: boolean
- resolution: String
+ startRecording(): void
+ stopRecording(): void
+ getStatus(): String
+ checkSecurity(): String
+ connectToWifi(): void
+ getConnectionStatus(): String
+ processVoiceCommand(command: String): void
+ getSupportedCommands(): String[]
