streamerClients {
    streamerClient(clientName = "TR_AU_CL") {
        isReplayable = true
        dataSource(processName = "ALPHA_STREAMER", sourceName = "TR_AU_ST")
        onMessage {
            send("ALPHA_EVENT_HANDLER", "EVENT_TRADE_AUDIT_STREAM")
        }
    }
}